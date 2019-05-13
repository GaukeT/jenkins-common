class common {
    def map1 = ['master': new props('prod', false)]
}

class props {
    def env
    boolean snapshot

    props(def env, boolean snapshot) {
        this.env = env
        this.snapshot = snapshot
    }
}
