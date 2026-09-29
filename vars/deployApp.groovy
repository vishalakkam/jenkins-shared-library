def call(Map config){
    echo "Application Name: ${config.appname}"
    echo "APP PORT: ${config.port}"
    echo "Environment: ${config.environment}"
    echo "Deploying the app"
}