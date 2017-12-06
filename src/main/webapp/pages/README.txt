Se quando o inicio.xhtml for executado, e não aparecer nenhum dado na tela, Copie e cole o texto a seguir no arquivo "faces-config.xml"
que está localizado em src/main/webapp/WEB-INF.


  <application>
   	   <locale-config>
			<default-locale>en</default-locale>
			<supported-locale>pt</supported-locale>
			<supported-locale>en</supported-locale>
	   </locale-config>
		
	   <resource-bundle>
	 	 <base-name>application</base-name>
		 <var>msg</var>
	    </resource-bundle>
     
     </application>
     
