pipeline{
    agent any
    
    tools {
        gradle 'Gradle-8.0-m4'
    }

    parameters {
        choice choices: ['Serenity', 'GemJar'], description: 'TestRunner Type?', name: 'RUNNER'
    }

    stages{
        stage("Running Mobile Test"){
            steps{
                bat '''
                    echo ========== Running Test using %RUNNER% ==========
                    gradle clean test --tests "*.%RUNNER%*"
                '''
            }
            post{
                always{
                    script {
                        if (params.RUNNER == 'Serenity') {
                            echo "========== Creating Serenity Report =========="
                            bat 'gradle reports'
                            publishHTML(
                                [
                                    allowMissing: false, 
                                    alwaysLinkToLastBuild: false,
                                    keepAll: false, 
                                    reportDir: 'target/site/serenity', 
                                    reportFiles: 'serenity-summary.html', 
                                    reportName: 'Summary Report', 
                                    reportTitles: '', 
                                    useWrapperFileDirectly: true
                                ]
                            )
                        }
                    }
                }
            }
        }
    }
}