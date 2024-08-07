
package Model;

/**
 *
 * @author HP
 */
public class EscolaModel {
    int id;
    String nome;
    String pais;
    String regiao;
    String local;
    int tel;
    String email;
    int turma;
    String niveis;

    public EscolaModel(int id, String nome, String pais, String regiao, String local, int tel, String email, int turma, String niveis) {
        this.id = id;
        this.nome = nome;
        this.pais = pais;
        this.regiao = regiao;
        this.local = local;
        this.tel = tel;
        this.email = email;
        this.turma = turma;
        this.niveis = niveis;
    }

    public EscolaModel() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        System.out.println(this.nome);
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    public String getNiveis() {
        return niveis;
    }

    public void setNiveis(String niveis) {
        this.niveis = niveis;
    }
    
}
