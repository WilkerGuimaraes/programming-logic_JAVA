package questao_3;

public class TesteTransporte {
	public static void main(String[] args) {
        // Testando a classe Transporte
        Transporte transporte = new Transporte();
        System.out.println("Transporte está ligado? " + transporte.estaLigado());
        System.out.println("Velocidade: " + transporte.getVelocidade());

        transporte.liga();
        System.out.println("Transporte está ligado? " + transporte.estaLigado());
        System.out.println("Velocidade: " + transporte.getVelocidade());

        transporte.setVelocidade(100);
        System.out.println("Velocidade: " + transporte.getVelocidade());

        transporte.desliga();
        System.out.println("Transporte está ligado? " + transporte.estaLigado());
        System.out.println("Velocidade: " + transporte.getVelocidade());

        // Testando a classe Carro
        Carro carro = new Carro();
        System.out.println("Carro está ligado? " + carro.estaLigado());
        System.out.println("Velocidade: " + carro.getVelocidade());
        System.out.println("Quilometragem: " + carro.getQuilometragem());

        carro.liga();
        System.out.println("Carro está ligado? " + carro.estaLigado());
        System.out.println("Velocidade: " + carro.getVelocidade());

        carro.setVelocidade(150);
        System.out.println("Velocidade: " + carro.getVelocidade());

        carro.setQuilometragem(50000);
        System.out.println("Quilometragem: " + carro.getQuilometragem());
    }
}
