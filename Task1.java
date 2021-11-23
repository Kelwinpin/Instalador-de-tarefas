public class Task1 extends Tarefa {

    int endInicial, id, prioridade;
    String nome, params;
    double tamanho;
    boolean eInstall = true;

    public Task1(Instalador install) {
        try{
        this.endInicial = install.getEndInicial();
        this.id = install.getId();
        this.prioridade = install.getPrioridade();
        this.nome = install.getNome();
        this.params = install.getParams();
        this.tamanho = install.getTamanho();
        }catch(NullPointerException ex){
            System.out.println("Tarefa não instalada!!!");
            eInstall = false;
        }
    }


    @Override
    public String toString() {
        return "Task1info [endInicial=" + endInicial + ", id=" + id + ", nome=" + nome + ", params=" + params
                + ", prioridade=" + prioridade + ", tamanho=" + tamanho + " bytes ]";
    }




    @Override
    void exe() {
        if(eInstall){
        for(int i=0;i<11;i++){

            System.out.print(i+" ");

        }
    }else{
       System.out.println("Tarefa não instalada!!!");
    }
    }




  
}
