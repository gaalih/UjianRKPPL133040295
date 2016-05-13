/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rkppl1212.rkppl;

import java.io.IOException;
import java.sql.SQLException;
import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;

/**
 *
 * @author SB604-22
 */
public class NewClass {
    static Logger log = Logger.getLogger(Main.class.getName());
   
     public void trace(Object message) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      org/apache/log4j/Logger.repository:Lorg/apache/log4j/spi/LoggerRepository;
         * 4: sipush        5000
         * 7: invokeinterface org/apache/log4j/spi/LoggerRepository.isDisabled:(I)Z
         * 12: ifeq          16
         * 15: return
         * 16: getstatic     org/apache/log4j/Level.TRACE:Lorg/apache/log4j/Level;
         * 19: aload_0
         * 20: invokevirtual org/apache/log4j/Logger.getEffectiveLevel:()Lorg/apache/log4j/Level;
         * 23: invokevirtual org/apache/log4j/Level.isGreaterOrEqual:(Lorg/apache/log4j/Priority;)Z
         * 26: ifeq          41
         * 29: aload_0
         * 30: getstatic     org/apache/log4j/Logger.FQCN:Ljava/lang/String;
         * 33: getstatic     org/apache/log4j/Level.TRACE:Lorg/apache/log4j/Level;
         * 36: aload_1
         * 37: aconst_null
         * 38: invokevirtual org/apache/log4j/Logger.forcedLog:(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V
         * 41: return
         *  */
        // </editor-fold>
    }
   public static void main(String[] args)throws IOException,SQLException{
   }
}
