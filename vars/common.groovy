class common {
    def map1 = [
            'master': new props('prod', false),
            'feature-jenkins-pipeline-as-code': new props('dev', true)
        ]
}

class props {
    def env
    boolean snapshot

    props(def env, boolean snapshot) {
        this.env = env
        this.snapshot = snapshot
    }
}
