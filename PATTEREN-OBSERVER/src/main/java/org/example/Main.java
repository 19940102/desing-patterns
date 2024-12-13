package org.example;

import obs.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args) {

        ObservableImpl observable = new ObservableImpl();
        Observer o1 = new ObserverImpl();
        Observer o2 = new ObserverImpl2();
        observable.subscribe(o1);
        observable.subscribe(o2);

        observable.subscribe(new Observer() {
            @Override
            public void update(Observable o) {
                if (o instanceof ObservableImpl obs) {
                    System.out.print("++++++++++++ Obs Impl 3 +++++++++++++");
                    System.out.print("Res = " + (((ObservableImpl) o).getState() * Math.cos(((ObservableImpl) o).getState())));
                    System.out.print("++++++++++++++++++++++++++++++++++");
                }
            }

        });

        observable.subscribe((obs) -> {
            if ( obs instanceof ObservableImpl o) {
                System.out.print("++++++++++++ Obs Impl 3 +++++++++++++");
                System.out.print("Res = " + o.getState() * Math.cos(o.getState()));
                System.out.print("++++++++++++++++++++++++++++++++++");
            }
        });

        observable.setState(60);
        observable.setState(80);
        observable.unsubscribe(o2);
        observable.setState(100);

        Button button = new Button("OK");
       button.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               System.out.print(e.getSource() );
           }
       });
    }
}
