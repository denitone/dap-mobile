# dap-mobile
Dockerize android project organization, this repo is an simple android app for dockerize 

# Organization
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



