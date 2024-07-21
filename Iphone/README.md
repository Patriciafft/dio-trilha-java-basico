classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()

    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet



    https://www.mermaidchart.com/app/projects/3ded1755-35e3-43e4-9107-a68bbff6eefc/diagrams/c2372e08-8af8-4419-a9b8-1698fe4ec230/version/v0.1/edit

    

