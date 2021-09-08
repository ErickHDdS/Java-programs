package principalErick;

import java.util.HashSet;
import java.util.StringTokenizer;

public class Interpretadora {
    
    private HashSet<String> palavraChave;
    
    public Interpretadora()
    {
        palavraChave = new HashSet<>();
    }

    public HashSet<String> getPalavraChave() {
        return palavraChave;
    }

    public void setPalavraChave(HashSet<String> palavraChave) {
        this.palavraChave = palavraChave;
    }
    
    public HashSet<String> interpretar(String problema)
    {
        palavraChave.clear();
        StringTokenizer st = new StringTokenizer(problema);
            while(st.hasMoreElements())
            {
                this.palavraChave.add(st.nextToken());
            }
        return palavraChave;    
    }    
}
