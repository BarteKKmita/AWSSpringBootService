How to run database:
* `docker build -t database .`
* `docker run -d -e POSTGRES_PASSWORD=root -e POSTGRES_USER=postgres -i --name database -p 5432:5432 database`
* if you need to log in to the docker's shell you can: either do it by Docker Desktop or
  via this command: `winpty docker exec -it database bash` (to exist type `exit
  ` in that console that will open)