IMAGE=app
docker tag $IMAGE:$BUILD_TAG  dockerazizdev/$IMAGE:$BUILD_TAG
docker login -u dockerazizdev -p $PASS
docker push dockerazizdev/$IMAGE:$BUILD_TAG
