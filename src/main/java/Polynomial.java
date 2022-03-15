import java.util.ArrayList;
import java.util.List;

public class Polynomial {
    private List<Monomial> plist = new ArrayList<Monomial>();

    public Polynomial(List<Monomial> plist) {
        this.plist = plist;
    }

    public List<Monomial> getList() {
        return plist;
    }
}

