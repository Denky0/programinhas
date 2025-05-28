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

    def limpar():
        entr_nome.delete(0,'end')
        entr_idade.delete(0,'end')
        entr_curso.set('Selecione um Curso')

    def enviar():
        nome=entr_nome.get()
        idade=entr_idade.get()
        curso=entr_curso.get()

        if nome and idade and curso:
            messagebox.showinfo('Cadastro Realizado', f'Nome: {nome}\nIdade: {idade}\nE-mail: {curso}')
            print(f'Nome: {nome}, Idade: {idade}, E-mail: {curso}')
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