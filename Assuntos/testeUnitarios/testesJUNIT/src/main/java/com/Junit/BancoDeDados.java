package com.Junit;

import java.util.logging.Logger;

public class BancoDeDados {
    public static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao(){
        LOGGER.info("iniciou conexao !");
    }
    public static void finalizarConexao(){
        LOGGER.info("finalizou conexao !");
    }

    public static void inserirDados(){
        LOGGER.info("inseriu pessoa");
    }
    public static void removerDados(){
        LOGGER.info("removeu pessoa");
    }

}
