public class StrategyImpl3 implements Strategy {

    public void apply() {
        System.out.println("++++++++++++Noyau de l'opération en utilisant la stratégie N°3+++++++++++");
    }

    public static class Context {
        private Strategy strategy = new DefaultStrategy() ;
        public  void perform(){
            System.out.println("###### Début de l'operation ###### ");
            System.out.println("****** Initialisation ********");
            Strategy.apply();
            System.out.println("===== Netoyage=====");
        }

        public void setStrategy(Strategy strategy) {
            this.strategy = strategy;
        }
    }
}
