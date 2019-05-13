class Common {
    static def config = [
            'master'                          : new Property(Environment.PROD, false),
            'feature-jenkins-pipeline-as-code': new Property(Environment.DEV, true)
    ]

    private static class Property {
        Environment env
        boolean snapshot

        Property(Environment env, boolean snapshot) {
            this.env = env
            this.snapshot = snapshot
        }
    }

    private static enum Environment {
        PROD,
        DEV
    }

}
