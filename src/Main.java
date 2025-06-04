import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cabecalho.mostrarCabecalho();

        ArrayList<Questao> questoes = new ArrayList<>();

        questoes.add(criarQuestao("Em qual jogo o personagem Kratos é o protagonista?",
                "A) Assassin's Creed", "B) God of War", "C) The Witcher", "D) Elden Ring", "E) Skyrim", "B"));

        questoes.add(criarQuestao("Qual empresa desenvolveu o jogo *Minecraft*?",
                "A) Mojang", "B) Valve", "C) Epic Games", "D) Ubisoft", "E) Rockstar Games", "A"));

        questoes.add(criarQuestao("Qual o nome do protagonista da franquia *The Legend of Zelda*?",
                "A) Zelda", "B) Ganon", "C) Link", "D) Epona", "E) Navi", "C"));

        questoes.add(criarQuestao("Em *GTA V*, quantos personagens principais são jogáveis?",
                "A) 1", "B) 2", "C) 3", "D) 4", "E) 5", "C"));

        questoes.add(criarQuestao("Qual é o nome do vilão principal em *Resident Evil 3*?",
                "A) Wesker", "B) Tyrant", "C) Nemesis", "D) Birkin", "E) Mr. X", "C"));

        questoes.add(criarQuestao("Qual jogo popular começa com uma nave caindo em uma ilha?",
                "A) PUBG", "B) Fortnite", "C) Call of Duty", "D) Apex Legends", "E) Warzone", "B"));

        questoes.add(criarQuestao("Qual jogo foi conhecido por sua dificuldade extrema e a frase 'YOU DIED'?",
                "A) Bloodborne", "B) Dark Souls", "C) Elden Ring", "D) Sekiro", "E) Hollow Knight", "B"));

        questoes.add(criarQuestao("Em que jogo os jogadores constroem estruturas com peças de diferentes formas?",
                "A) Lego Worlds", "B) Roblox", "C) Tetris", "D) Minecraft", "E) Terraria", "C"));

        questoes.add(criarQuestao("Qual franquia tem os pokémons como personagens principais?",
                "A) Yu-Gi-Oh!", "B) Digimon", "C) Final Fantasy", "D) Pokémon", "E) Dragon Quest", "D"));

        questoes.add(criarQuestao("Qual personagem é um encanador e estrela da Nintendo?",
                "A) Sonic", "B) Donkey Kong", "C) Luigi", "D) Mario", "E) Bowser", "D"));

        questoes.add(criarQuestao("Qual desses jogos é focado em agricultura e relacionamentos?",
                "A) Stardew Valley", "B) The Sims", "C) Animal Crossing", "D) Terraria", "E) Harvest Moon", "A"));

        questoes.add(criarQuestao("Em *League of Legends*, quantos jogadores há em cada equipe padrão?",
                "A) 3", "B) 4", "C) 5", "D) 6", "E) 10", "C"));

        questoes.add(criarQuestao("Qual é o subtítulo do jogo *The Witcher 3*?",
                "A) Bloodlines", "B) Dark Fate", "C) Wild Hunt", "D) Dragon's Curse", "E) Eternal Flame", "C"));

        questoes.add(criarQuestao("Quem é o criador da série *Metal Gear*?",
                "A) Shigeru Miyamoto", "B) Hideo Kojima", "C) Hideki Kamiya", "D) Ken Levine", "E) Tetsuya Nomura", "B"));

        questoes.add(criarQuestao("Qual desses é um personagem jogável em *Overwatch*?",
                "A) Valorant", "B) Winston", "C) Ghost", "D) Soap", "E) Mirage", "B"));

        int acertos = 0;
        for (Questao q : questoes) {
            q.escrevaQuestao();
            String resposta = q.leiaResposta();
            if (q.isCorreta(resposta)) {
                acertos++;
            }
        }

        int total = questoes.size();
        double porcentagem = (acertos * 100.0) / total;

        System.out.println("Você acertou " + acertos + " de " + total + " questões!");
        System.out.printf("Porcentagem de acertos: %.2f%%\n", porcentagem);
    }

    public static Questao criarQuestao(String pergunta, String a, String b, String c, String d, String e, String correta) {
        Questao q = new Questao();
        q.pergunta = pergunta;
        q.opcaoA = a;
        q.opcaoB = b;
        q.opcaoC = c;
        q.opcaoD = d;
        q.opcaoE = e;
        q.correta = correta;
        return q;
    }
}
