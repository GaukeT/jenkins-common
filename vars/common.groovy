class common {
    def config = [
            'master': new property(environment.PROD, false),
            'feature-jenkins-pipeline-as-code': new property(environment.DEV, true)
        ]
}

class property {
    environment env
    boolean snapshot

    property(environment env, boolean snapshot) {
        this.env = env
        this.snapshot = snapshot
    }
}

enum environment {
    PROD,
    DEV
}
