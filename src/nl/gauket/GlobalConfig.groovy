package nl.gauket

class GlobalConfig {
    // version property for demo purpose
    static String library_version = "0.0.1"

    // mapping of branch to environment
    static def config = [
            'master'     : 'prod',
            'integration': 'test',
            'bugfix-*'   : 'dev',
            'feature-*'  : 'dev'
    ]

}
