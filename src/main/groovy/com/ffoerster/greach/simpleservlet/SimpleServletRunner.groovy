package com.ffoerster.greach.simpleservlet
/**
 * Created by Fabian Förster 
 * Date: 19/03/15
 * Time: 10:34
 */
import org.eclipse.jetty.webapp.WebAppContext
import org.eclipse.jetty.server.Server
class SimpleServletRunner {
    public static void main(String[] args) {
        String webApp = args[0]
        int port = Integer.valueOf(args[1])
        String context = args[2]

        Server server = new Server(port)

        WebAppContext webAppContext = new WebAppContext()
        webAppContext.contextPath=context
        webAppContext.war = new File(webApp).absolutePath

        server.handler = webAppContext

        server.start()
        server.join()
    }
}
