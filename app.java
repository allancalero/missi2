

wifi:
FCyS1_50ghz
FCyS2_50ghz





GITHUB

CREAR UNA CARPETA EN EL ESCRITORIO

MISS-> Carpeta local, ordinaria de windows

clic derecho, open gitbush here

configurar, nombre y correo
git config --global user.name "Allan Calero"
git config --global user.email "allan.calero2gmail.com"
git init --> Convertir la carpeta en repositorio de git
git status --> muestra si hay  pendiente.
git add app . (nombre del archivo ), agrega
git add . ,	( le dice que rastree toda la carpeta )
		( el  . significa qye apunta la carpeta)
		(el ..  significa que apunta)

git log
untratcked (ratrear)


git commit -am "se gargo un comentario como prueba app.txt" (se agrego el archivo app.java) le pone  una descripcion al estado 
git log
pwd, miuestra los directorio de carpeta.

ir a github
crear reposotorio en la nube
ir a repositorio local

git remote add origin https://github.com/allancalero/missi.git (asocia la carpeta local con el repositorio de la nube)

git remote -v 
git push -u origin master
