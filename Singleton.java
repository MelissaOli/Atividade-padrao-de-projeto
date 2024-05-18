/*
 * 1. Declaração da classe Singleton.
 * 2. Declaração da variável de instância `instance`.
 * 3. Declaração da variável de instância `data`.
 * 4. Declaração do construtor privado da classe Singleton.
 * 5. Declaração do método `getInstance` para obter a instância única.
 * 6. Verificação se a instância é nula.
 * 7. Início de um bloco sincronizado.
 * 8. Verificação novamente se a instância é nula (double-checked locking).
 * 9. Criação de uma nova instância da classe Singleton com o argumento `data`.
 * 10. Retorno da instância existente ou recém-criada.
 */
public class Singleton {
	private static volatile Singleton instance;
	private String data;
	
	private Singleton(String data) {
		this.data = data;
	}
	
	public static Singleton getInstance(String data) {
		
		if(instance == null) {
			synchronized(Singleton.class) {
				if(instance == null) {
					instance = new Singleton(data);
				}
			}
		}
		return instance;
	}
}
