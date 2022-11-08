package Calculadora.Modelo;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;

public class Memoria
{
    private enum TipoComando {
            ZERAR, NUMERO, DIV, MULT, SUB, SOMA, IGUAL, VIRGULA, SINAL
    };
    private static Memoria instancia = new Memoria();


    private TipoComando ultimaOperacao = null;
    private boolean substituir = false;
    private String textoAtual = "";
    private String textoBuffer = "";

    private final List<MemoriaObservador> observadores =
            new ArrayList<>();
    private Memoria()
    {

    }

    public static Memoria getInstancia()
    {
        return instancia;
    }

    public void adicionarObversavodr(MemoriaObservador o)
    {
        observadores.add(o);
    }

    public String getTextoAtual()
    {
        return textoAtual.isEmpty() ? "0" : textoAtual;
    }

    public void processarComando(String valorDigitado)
    {
        TipoComando tipoComando = detectarTipoComando(valorDigitado);
        if(tipoComando == null)
        {
            return;
        } else if (tipoComando == TipoComando.ZERAR)
        {
            textoAtual = "";
            textoBuffer = "";
            substituir = false;
            ultimaOperacao = null;
        } else if (tipoComando == TipoComando.SINAL && textoAtual.contains("-"))
        {
            textoAtual = "-" + textoAtual.substring(1);
        }
        else if (tipoComando == TipoComando.SINAL && !textoAtual.contains("-"))
        {
            textoAtual = "-" + textoAtual;
        }
        else if (tipoComando == TipoComando.NUMERO
                || tipoComando == TipoComando.VIRGULA)
        {
            textoAtual = substituir ? valorDigitado : textoAtual + valorDigitado;
            substituir = false;
        } else
        {
            substituir = true;
            textoAtual = obterResultadoOperacao();
            textoBuffer = textoAtual;
            ultimaOperacao = tipoComando;

        }
        observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
    }

    private String obterResultadoOperacao()
    {
        if(ultimaOperacao == null || ultimaOperacao == TipoComando.IGUAL)
        {
            return textoAtual;
        }

        double numeroBuffer = Double.parseDouble(textoBuffer.replace(",", "."));
        double numeroAtual = Double.parseDouble(textoAtual.replace(",", "."));

        double resultado = 0;

        if(ultimaOperacao == TipoComando.SOMA)
        {
            resultado = numeroBuffer + numeroAtual;
        } else if (ultimaOperacao == TipoComando.SUB)
        {
            resultado = numeroBuffer - numeroAtual;
        }
        else if (ultimaOperacao == TipoComando.SUB)
        {
            resultado = numeroBuffer - numeroAtual;
        }
        else if (ultimaOperacao == TipoComando.MULT)
        {
            resultado = numeroBuffer * numeroAtual;
        }
        else if (ultimaOperacao == TipoComando.DIV)
        {
            resultado = numeroBuffer / numeroAtual;
        }

        String resultadoString = Double.toString(resultado).replace(".", ",");
        boolean inteiro = resultadoString.endsWith(",0");


        return inteiro ? resultadoString.replace(",0", "") : resultadoString;
    }

    private TipoComando detectarTipoComando(String valorDigitado)
    {
        if(textoAtual.isEmpty() && valorDigitado == "0")
        {
            return null;
        }
        try
        {
            Integer.parseInt(valorDigitado);
            return TipoComando.NUMERO;
        }
        catch (NumberFormatException e)
        {
            //nao sendo NUMERO...
            if("AC".equals(valorDigitado))
            {
                return TipoComando.ZERAR;
            }
            else if ("/".equals(valorDigitado))
            {
                return TipoComando.DIV;
            }
            else if ("*".equals(valorDigitado))
            {
                return TipoComando.MULT;
            }
            else if ("+".equals(valorDigitado))
            {
                return TipoComando.SOMA;
            }
            else if ("-".equals(valorDigitado))
            {
                return TipoComando.SUB;
            }
            else if ("=".equals(valorDigitado))
            {
                return TipoComando.IGUAL;
            }
            else if ("±".equals(valorDigitado))
            {
                return TipoComando.SINAL;
            }
            else if (",".equals(valorDigitado) && !textoAtual.contains(","))
            {
                return TipoComando.VIRGULA;
            }
        }
        return null;
    }
}
