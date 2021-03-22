*************** README ***************

Para tener en cuenta:
	
	* El link de descarga es https://github.com/Soriano8807/prueba_Devsavant.git
	* El proyecto fue creado en IntellijIDE con el JDK 1.8.
	* Se clona normalmente y al cargarlo en un IDE se debe permitir que se actualicen las dependencias.
	* La ejecución se realiza desde la clase RunnerFeatures.
	* El proyecto cuenta con un archivo Test.properties con la información necesaria para la ejecucion de los casos
	

Patron de diseño:

Para la construcción de este proyecto utilice el patron POM (Page Object Model) y queda evidenciado en la división por paquetes, 
uno para registrar los objectos de cada pantalla (pageObjects) y otro para el registro de los test (test). Asi mismo utilice Cucumber 
para la definicion de los escenarios automatizados.


Reporte:

El proyecto no cuenta con la generación de un reporte funcional pero se trato de implementar el reporte extentreport de Cucumber
pero por fallas en el plugin no fue posible dejarlo funcionando.

