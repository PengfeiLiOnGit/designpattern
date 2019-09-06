package intermediary;

public abstract class Something {
    private Media media;

    public Something(Media media) {
        this.media = media;
    }

    abstract void getMsg(String msg);
}
