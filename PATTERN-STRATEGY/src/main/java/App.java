import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        StrategyImpl3.Context ctx = new StrategyImpl3.Context();
        Scanner scanner =new Scanner(System.in);
        Map<String, Strategy> strategyMap= new HashMap<>();
        strategyMap.put("st1", new StrategyImpl1());
        strategyMap.put("st2", new StrategyImpl2());
        strategyMap.put("st3", new StrategyImpl3());
        strategyMap.put("d", new DefaultStrategy());

        while (true){
            System.out.print("Donner votre stratégie");
            String st = scanner.nextLine();
            Strategy strategy = strategyMap.get(st);
            ctx.setStrategy(strategy);
            ctx.perform();
        }

    }
}
