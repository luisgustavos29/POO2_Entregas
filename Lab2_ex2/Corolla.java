public class Corolla implements IVehicle{
    @Override
    public void start() {
        System.out.println("Corolla ligando...");
    }

    @Override
    public void drive() {
        System.out.println("Corolla rodando...");
    }

    @Override
    public void stop() {
        System.out.println("Corolla parando...");
    }
}

