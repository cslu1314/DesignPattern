package OrderPattern;

public class SteroOffCommand implements Command{
    Stereo stereo;

    public SteroOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
