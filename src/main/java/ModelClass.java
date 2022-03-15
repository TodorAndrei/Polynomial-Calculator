import java.util.*;

public class ModelClass {
    public Polynomial toPolynomial(String str) {
        str = str.replace("-", "+-");
        List<String> strings = List.of(str.split("\\+"));
        Map<Integer, Integer> map = new HashMap<>();
        for (String s : strings) {
            List<String> strings2 = List.of(s.split("\\*x\\^"));
            map.put(Integer.parseInt(strings2.get(1)), Integer.parseInt(strings2.get(0)));
        }
        List<Monomial> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            Monomial mon = new Monomial(pair.getKey(), pair.getValue());
            list.add(mon);
        }
        Polynomial result = new Polynomial(list);
        return result;
    }

    public String toString(Polynomial polinom) {
        List<Monomial> list = polinom.getList();
        String str = new String();
        Collections.reverse(list);
        for (Monomial m : list) {
            if (m.getCoefficient() > 0) str = str + "+" + m.getCoefficient() + "*x^" + m.getDegree();
            else str = str + m.getCoefficient() + "*x^" + m.getDegree();
        }
        return str;
    }

    public Polynomial Derivative(Polynomial polinom) {
        List<Monomial> list = polinom.getList();
        if (list.get(0).getDegree() == 0) list.remove(0);
        for (Monomial monom : list) {
            monom.setCoefficient(monom.getCoefficient() * monom.getDegree());
            monom.setDegree(monom.getDegree() - 1);
        }
        Polynomial result = new Polynomial(list);
        return result;
    }

    public Polynomial Integrate(Polynomial polinom) {
        List<Monomial> list = polinom.getList();
        for (Monomial monom : list) {
            monom.setCoefficient(monom.getCoefficient() / (monom.getDegree() + 1));
            monom.setDegree(monom.getDegree() + 1);
        }
        Polynomial result = new Polynomial(list);
        return result;
    }

    public Polynomial Add(Polynomial polinom1, Polynomial polinom2) {
        List<Monomial> list1 = polinom1.getList();
        List<Monomial> list2 = polinom2.getList();
        List<Monomial> result = new ArrayList<>();
        for (Monomial m1 : list1) {
            for (Monomial m2 : list2) {
                if (m1.getDegree() < m2.getDegree() && m1.isAdded() == false) {
                    result.add(m1);
                    m1.setAdded(true);
                } else if (m1.getDegree() > m2.getDegree() && m2.isAdded() == false) {
                    result.add(m2);
                    m2.setAdded(true);
                } else if (m1.getDegree() == m2.getDegree() && m1.isAdded() == false && m2.isAdded() == false) {
                    Monomial mres = new Monomial(m1.getDegree(), m1.getCoefficient() + m2.getCoefficient());
                    result.add(mres);
                    m1.setAdded(true);
                    m2.setAdded(true);
                }
            }
        }
        if (list1.get(list1.size() - 1).getDegree() > list2.get(list2.size() - 1).getDegree()) {
            result.add(list1.get(list1.size() - 1));
        } else {
            result.add(list2.get(list2.size() - 1));
        }
        Polynomial p = new Polynomial(result);
        return p;
    }

    public Polynomial Sub(Polynomial polinom1, Polynomial polinom2) {
        List<Monomial> list2 = polinom2.getList();
        for (Monomial m : list2) {
            m.setCoefficient(-m.getCoefficient());
        }
        Polynomial result = Add(polinom1, polinom2);
        return result;
    }
}
