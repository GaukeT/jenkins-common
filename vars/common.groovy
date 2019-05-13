class common {
    def config = [
            'master'                          : new Property(Environment.PROD, false),
            'feature-jenkins-pipeline-as-code': new Property(Environment.DEV, true)
    ]

    private class Property {
        Environment env
        boolean snapshot

        Property(Environment env, boolean snapshot) {
            this.env = env
            this.snapshot = snapshot
        }
    }

    private enum Environment {
        PROD,
        DEV
    }

}
