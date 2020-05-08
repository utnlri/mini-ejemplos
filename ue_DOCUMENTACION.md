# UTN FRRO - Asignatura: Diseño de Sistemas.
## Proyecto: Mini Ejemplos Spring   
##    Code name:  mini-ejemplos
Objetivo: programar con Spring mini ejemplos para introducir incrementalmente conceptos en clases DS en UTN 2020

Creado: [UTDC013 - LRI 1/5/2020]

## Ejecutar en Heroku [Web] 
URL de la APP: https://mini-ejemplos.herokuapp.com/ 

## Para Desarrollar
+ Esta aplicación fue creada con el IDE: Cloud Hosted Eclipse (CHE) --> https://che.openshift.io/dashboard
+ GIT: https://github.com/utnlri/mini-ejemplos

## Para ejecutar la aplicación mini-ejemplos [Local] --> NO esta FUNCIONANDO en CHE
//////1. Botón derecho sobre MiniEjemplosApplication.java \ Run as \ Java Application   
//////2. En chrome URL: http://localhost:8080/ --> Esto mapea al Menú pcial que corresponde al home.html 

## Bitácora proyecto mini-ejemplos
[1/5/2020 LRI] Tareas realizadas:     
1. Creación del proyecto en Spring Initializr  
2. Creación del repositorio en GitHub (Ver url más arriba)
3. Push del resto de los files creados con Spring Initializr desde Windows con GitHub Desktop
4. Creación del Workspace en CHE ( wksp-LRI-ukb5 )  
5. Fetch del proyecto en Eclipse CHE (automático al crear el Wokspace)
.
Ver detalles en Evernote "UTDC013 - DS Spring 2020::Programar Mini-Ejemplos"  
6. Creación de:   
   + Home.html  
   + ControladorHome.java  --> Mapeando @RequestMapping("/")
   .
7. Deploy en Heroku (ver URL más arriba)

[1/5/2020 FIN]

[2/5/2020 LRI] Tareas realizadas: 
1. Se trabajó a nivel de Workspace de CHE (lo que no impacta en Github)
    + Back up de Devfile (ver Q:\3-UNIV\UTN_DS\DS-2020\Spring_LRI-2019-y-2020)
    + Pruebas de crear nuevo workspace en base a Devfile
    + Comandos (tasks) de Theia para ejecutar la app Sprinboat en CHE
    + Agregar los comandos al Devfile para que sean persistentes a nivel workspace
    + Ver detalles de lo relaizado en "UTDC013 - DS Spring 2020::Programar Mini-Ejemplos"

[2/5/2020 FIN]

[3/5/2020 LRI] Tareas realizadas: 
1. Se crea branch DEV
2. Se configura CHE para usar DEV
3. Se agregan componentes para ejemplos JPQL con entidad Cliente
    + Cliente
    + ClienteDAO
    + home.html (Modif)
    + ControladorEjJPQL
    + MiniEjemplosApplication --> cargarDatos()
    + EjJPQL\clientes-mostrar.html
4. Se completó funcionalidad punto menú "Listar Todos Clientes --> DAO - FindAll()" ==> listo para merge con DEV

=====

5. Se agrea funcionalidad para ejemplo getOne() (Buscar Cliente x ID), y Select (Buscar Cliente x Categoria Fija)
     + Cliente (Modif --> agregar atributo limiteCredito)
     + clientes-mostrar.html (Modif --> agregar atributo limiteCredito)
     + MiniEjemplosApplication (Modif -->  cargarDatos)
     + home.html (Modif --> agregar nuevas opciones menu)
     + ControladorEjJPQL (Modif --> se agrega métodos para manejar nuevas opciones de menú)
     + ClienteDAO (Modif --> agregar buscarCategoriaFija() )
6. Se completó funcionalidad punto menú "Buscar x ID" y "x Categoria Fija"  ==> listo para merge con DEV

[3/5/2020 FIN]

[8/5/2020 LRI] Tareas realizadas:
1. Se crea branch DEV-02
2. Se configura CHE para usar DEV-02

