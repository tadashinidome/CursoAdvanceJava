/*
  NetWorking es un concepto de conectividad
entre dos o mas dispositivos juntos, que comparten recursos.

Programacion de sockets proporsiona la facilidad de compartie
datos entre diferentes dispositivos.

VEntajas del Networkin en JAva
    Compartir recursos 
    Centralizar la gestion del software

Concepto Clave:
DireccionIP: Numero dinamico asignado a 
un nodo de una red, conpuesto por octetos que 
van desde el 0 al 255.
 Es un adireccion logica que puede ser cambiada

Protocolo: Conjunto de reglas para establecer
la comunicacion: ejmp, FTP,TCP, Telnet,SMTP, etc.

Puerto: Esta asociado a la direccion ip para la
comunicacion entre aplicaciones.

MAC: (Media Access Control) Identificador unico
de NIC (Network Interface Control).
Un protocolo de una red puede tener multiples NIC
pero solo una MAC.
Direccion fisica, estatica

Oriented connection protocolo:
    Es un protocolo de tipo TCP, TCP/IP, confiable 
pero lento. EL acuse de recibido es enviado por el
receptor.

Connection Less Protocolo:
    El receptor no enviar el acuese de recibo.
Es rapido, sin embargo no es confiable, pueden
o no llegar lo spaquetes. Ej: UDP

Socket: punto final en una conexion bidireccional

La programacion de sockets se utiliza para la
comunicacion entre aplicaciones que se ejecutan
en diferentes JREs. Java Runtime Enviroment


La programacionm de JavaSokets puede estar bajo
ambos protocolos (OCP, OCL)
Las clases Java Socket y ServerSocket
Se utilizan para la programacion aorientada a la
conexion.

Las clases DatagramaSocket y DatagramaPacket
Son usadaspara la programacion de socket sin 
conexion.

El cliente en la progrmacion necesita saber>
    IP Addres de server
    Port Number
    Socket Class

El socket es un punto final para las comunicacion
entre dispositivos.
    Socket class
    Metodos
        public InputStream getInputStream()
            regresa el IS adjunto con el socket
        public outputStream getOutputStream()
            regresa el os adjunto al socket
        public synchronized coid close()
            cierra el socket

    SeverSocket
    Metodos
        public socket accpet()
            establece la conexion entrante
        public synchronized coid close()
            cierra la conexion del servidor
*/

package javaadvanced.viernes;

public class NT {
    
}
