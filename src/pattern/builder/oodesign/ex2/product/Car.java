package pattern.builder.oodesign.ex2.product;

/**
 * Created by gauravs on 18/2/16.
 */
public class Car implements Vehicle{
    private String tyre;
    private String handle;
    private String seat;

    public String getTyre() {
        return tyre;
    }

    public void setTyre(String tyre) {
        this.tyre = tyre;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
