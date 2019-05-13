package nl.gauket

class GlobalConfig {
    static String library_version = "0.0.1"

    static def config = [
            'master'                          : 'prod',
            'feature-jenkins-pipeline-as-code': 'dev'
    ]

}
