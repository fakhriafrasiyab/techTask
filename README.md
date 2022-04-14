1) I create database and connect the app to db.
2) I make id auto incremented that's why there is no need to send id in request body.
3) if you want to run and connect the db, please do following:
   A) run this in docker.
   docker run --name test-mysql -e MYSQL_ROOT_PASSWORD=root -p 3306:3306 -d mysql
   B) Create schema named test.