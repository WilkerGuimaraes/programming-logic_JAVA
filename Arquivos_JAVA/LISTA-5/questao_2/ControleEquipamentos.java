package questao_2;

public class ControleEquipamentos {
	public static void main(String[] args) {
        // Testando a classe Equipamento
        Equipamento equipamento = new Equipamento();
        System.out.println("Equipamento está ligado? " + equipamento.estaLigado());

        equipamento.liga();
        System.out.println("Equipamento está ligado? " + equipamento.estaLigado());

        equipamento.desliga();
        System.out.println("Equipamento está ligado? " + equipamento.estaLigado());

        // Testando a classe EquipamentoSonoro
        EquipamentoSonoro equipamentoSonoro = new EquipamentoSonoro();
        System.out.println("Equipamento Sonoro está ligado? " + equipamentoSonoro.estaLigado());
        System.out.println("Volume: " + equipamentoSonoro.getVolume());

        equipamentoSonoro.liga();
        System.out.println("Equipamento Sonoro está ligado? " + equipamentoSonoro.estaLigado());
        System.out.println("Volume: " + equipamentoSonoro.getVolume());

        equipamentoSonoro.aumentaVolume();
        System.out.println("Volume aumentado: " + equipamentoSonoro.getVolume());

        equipamentoSonoro.mono();
        System.out.println("Modo: " + (equipamentoSonoro.estaLigado() ? "Ligado" : "Desligado") + " | Modo: Mono");
    }
}
