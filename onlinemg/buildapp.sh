mvn clean install -DskipTests
docker rm -f onlinemg
yes | docker image prune -a
docker compose -f docker-compose.yml up