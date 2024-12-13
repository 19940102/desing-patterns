package obs;

public class ObserverImpl implements Observer {
    @Override
    public void update(Observable observable) {
        if (observable instanceof ObservableImpl obs) {
            System.out.print("***** OBS Impl 1*******");
            System.out.print("New State = " + obs.getState());
            System.out.print("***** OBS Impl 1 *******");
        }
    }



}
