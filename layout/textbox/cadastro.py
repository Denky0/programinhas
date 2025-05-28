import customtkinter as h
from tkinter import messagebox

h.set_appearance_mode('dark')
h.set_default_color_theme('green')

jan=h.CTk()
jan.geometry('500x450')
jan.title('Janela de Cadastro')
jan.resizable(False,False)

def exibir_mensagem():
    print('Seja bem vindo')

def fechar():
    jan.destroy()

def abrir_cadastro():
    cadastr=h.CTkToplevel(jan)
    cadastr.geometry('400x350')
    cadastr.title('Cadastro')
    cadastr.configure(fg_color='lightgreen')
    cadastr.resizable(False,False)

    frame=h.CTkFrame(cadastr)
    frame.pack(
        pady=5,
        padx=5,
        fill='both',
        expand=True
    )

    entr_nome=h.CTkEntry(
        frame,
        placeholder_text='Nome',
    )
    entr_nome.pack(pady=5)

    entr_idade=h.CTkEntry(
        frame,
        placeholder_text='Idade',
    )
    entr_idade.pack(pady=5)

    cursos=[
        'Direito',
        'Medicina',
        'ADS',
        'Ciência da Computação',
        'Design',
        'T.I',
        'marketing',
        'Arquitetura',
        ]
    entr_curso=h.CTkOptionMenu(
        frame,
        values=cursos
        )
    entr_curso.pack(pady=5)
    entr_curso.set('Selecione um Curso')

    entr_email=h.CTkEntry(
        frame,
        placeholder_text='E-mail'
    )
    entr_email.pack(pady=5)

    generos=['Masculino', 'Feminino', 'Não quero informar']
    entr_genero=h.CTkOptionMenu(
        frame,
        values=generos
    )
    entr_genero.pack(pady=5)
    entr_genero.set('Selecione seu Gênero')

    def limpar():
        entr_nome.delete(0,'end')
        entr_idade.delete(0,'end')
        entr_curso.set('Selecione um Curso')
        entr_email.delete(0,'end')
        entr_genero.set('Selecione seu Gênero')

    def enviar():
        nome=entr_nome.get()
        idade=entr_idade.get()
        curso=entr_curso.get()
        email=entr_email.get()
        genero=entr_genero.get()


        if nome and idade and curso and email and genero:
            messagebox.showinfo('Cadastro Realizado', f'Nome: {nome}\nIdade: {idade}\nCurso: {curso}\nE-mail: {email}\nGênero: {genero}')
            print(f'Nome: {nome}, Idade: {idade}, Curso: {curso} E-mail: {email} Gênero: {genero}')
        else:
            messagebox.showwarning('Campos Incompletos', 'Por gentileza, preencha todos os campos.')

    h.CTkButton(
        frame,
        text='Enviar',
        command=enviar
    ).pack(pady=5)

    h.CTkButton(
        frame,
        text='Limpar',
        command=limpar
    ).pack(pady=5)

    h.CTkButton(
        frame,
        text='Fechar',
        command=cadastr.destroy
    ).pack(pady=5)
    
h.CTkButton(
    jan,
    text='Exibir Texto',
    command=exibir_mensagem
).pack(pady=10)

h.CTkButton(
    jan,
    text='Criar Cadastro',
    command=abrir_cadastro
).pack(pady=10)

h.CTkButton(
    jan,
    text='Fechar',
    command=fechar
).pack(pady=10)

jan.mainloop()