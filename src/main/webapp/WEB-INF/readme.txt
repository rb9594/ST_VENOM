1) Create a dynamic web project
2) Convert to a maven project
3) Create resources directory under src folder (plain src folder)
4) Add logback.xml in resources folder and verify values inside it such as log directory
5) Update pom.xml to include logback dependency
6) Create a package under Java Resources src/main/java called com.att.services
7) Add your dependencies for postgress jdbc driver and hibernate at https://mvnrepository.com
8) You need to go to Eclipse Marketplace and download a tool called JBOSS Tools looking for a hibernate plugin, you need this download so you can create
hibernate.cfg.xml.  Go to project, file ->new type in hibernate and look for the cfg file
9) Create hibernate.cfg.xml in resources folder
10) Create .gitignore file
11) Run git init command