class Pessoa:
    def __init__(nome, idade, endereco):
        self.nome = nome
        self.idade = idade
        self.endereco = endereco
        pass

    def imprimePessoa():
        return (self.nome, self.idade, self.endereco)

Rafael = Pessoa("Rafael", 18, "rua tulipas")
(no, idd, end) = imprimePessoa()
print("nome: %20s \nidade: %2d \nrua: %40s" % (no, idd, end))