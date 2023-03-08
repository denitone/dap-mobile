# what is dap-mobile repo
dap-mobile repo is an simple android project, with 2 page likes login & home page. and also this project already implement the docker for simple dev and testing the app.

# Documentation
Visit [Dockerize-android-project](https://github.com/dockerize-android-project) page, for see the all documentation


## Snippet code for dockerize
### Build Docker image
`
docker build -t dap_mobile .
`

### create docker container (clean)
`
docker run --rm -v "$PWD":/home/gradle/ -w /home/gradle/MyApp dap-mobile gradle -PdisablePreDex clean
`
`
docker run  android-build:android-gradle 
`

### create docker container (lint)
`
docker run --rm -v "$PWD":/home/gradle/ -w /home/gradle/MyApp dap-mobile gradle -PdisablePreDex lint
`



