import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerClass {
    private final ViewClass calculatorView;
    private final ModelClass calculatorModel;

    public ControllerClass(ViewClass calculatorView, ModelClass calculatorModel) {
        this.calculatorView = calculatorView;
        this.calculatorModel = calculatorModel;
        calculatorView.bxlistener(new Listenerx());
        calculatorView.b0listener(new Listener0());
        calculatorView.b1listener(new Listener1());
        calculatorView.b2listener(new Listener2());
        calculatorView.b3listener(new Listener3());
        calculatorView.b4listener(new Listener4());
        calculatorView.b5listener(new Listener5());
        calculatorView.b6listener(new Listener6());
        calculatorView.b7listener(new Listener7());
        calculatorView.b8listener(new Listener8());
        calculatorView.b9listener(new Listener9());
        calculatorView.bPluslistener(new ListenerPlus());
        calculatorView.bMinuslistener(new ListenerMinus());
        calculatorView.bMullistener(new ListenerMul());
        calculatorView.bPowlistener(new ListenerPow());
        calculatorView.bSet1(new ListenerSet1());
        calculatorView.bSet2(new ListenerSet2());
        calculatorView.bAddlistener(new ListenerAdd());
        calculatorView.bSublistener(new ListenerSub());
        calculatorView.bDerivativelistener(new ListenerDerivative());
        calculatorView.bIntegratelistener(new ListenerIntegrate());

    }

    class Listenerx implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calculatorView.setText4(calculatorView.getText4() + "x");
        }
    }

    class Listener0 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calculatorView.setText4(calculatorView.getText4() + "0");
        }
    }

    class Listener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calculatorView.setText4(calculatorView.getText4() + "1");
        }
    }

    class Listener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calculatorView.setText4(calculatorView.getText4() + "2");
        }
    }

    class Listener3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calculatorView.setText4(calculatorView.getText4() + "3");
        }
    }

    class Listener4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calculatorView.setText4(calculatorView.getText4() + "4");
        }
    }

    class Listener5 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calculatorView.setText4(calculatorView.getText4() + "5");
        }
    }

    class Listener6 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calculatorView.setText4(calculatorView.getText4() + "6");
        }
    }

    class Listener7 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calculatorView.setText4(calculatorView.getText4() + "7");
        }
    }

    class Listener8 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calculatorView.setText4(calculatorView.getText4() + "8");
        }
    }

    class Listener9 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calculatorView.setText4(calculatorView.getText4() + "9");
        }
    }

    class ListenerPlus implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calculatorView.setText4(calculatorView.getText4() + "+");
        }
    }

    class ListenerMinus implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calculatorView.setText4(calculatorView.getText4() + "-");
        }
    }

    class ListenerMul implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calculatorView.setText4(calculatorView.getText4() + "*");
        }
    }

    class ListenerPow implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calculatorView.setText4(calculatorView.getText4() + "^");
        }
    }

    class ListenerSet1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calculatorView.setText1(calculatorView.getText4());
            calculatorView.setText4("");
        }
    }

    class ListenerSet2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calculatorView.setText2(calculatorView.getText4());
            calculatorView.setText4("");
        }
    }

    class ListenerAdd implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String s1 = calculatorView.getText1();
            String s2 = calculatorView.getText2();
            Polynomial polinom1 = calculatorModel.toPolynomial(s1);
            Polynomial polinom2 = calculatorModel.toPolynomial(s2);
            Polynomial result = calculatorModel.Add(polinom1, polinom2);
            calculatorView.setText3(calculatorModel.toString(result));
        }
    }

    class ListenerSub implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String s1 = calculatorView.getText1();
            String s2 = calculatorView.getText2();
            Polynomial polinom1 = calculatorModel.toPolynomial(s1);
            Polynomial polinom2 = calculatorModel.toPolynomial(s2);
            Polynomial result = calculatorModel.Sub(polinom1, polinom2);
            calculatorView.setText3(calculatorModel.toString(result));
        }
    }

    class ListenerDerivative implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = calculatorView.getText1();
            Polynomial polinom = calculatorModel.toPolynomial(s);
            Polynomial derivate = calculatorModel.Derivative(polinom);
            calculatorView.setText3(calculatorModel.toString(derivate));
        }
    }

    class ListenerIntegrate implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = calculatorView.getText1();
            Polynomial polinom = calculatorModel.toPolynomial(s);
            Polynomial integrate = calculatorModel.Integrate(polinom);
            calculatorView.setText3(calculatorModel.toString(integrate));
        }
    }
}
