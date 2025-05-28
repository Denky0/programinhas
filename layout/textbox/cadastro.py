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

    frame=h.CTkFrame(cadastr)
    frame.pack(
        pady=20,
        padx=20,
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

    entr_email=h.CTkEntry(
        frame,
        placeholder_text='E-mail'
    )
    entr_email.pack(pady=5)

    def limpar():
        entr_nome.delete(0,'end')
        entr_idade.delete(0,'end')
        entr_email.delete(0,'end')

    def enviar():
        nome=entr_nome.get()
        idade=entr_idade.get()
        email=entr_email.get()

        if nome and idade and email:
            messagebox.showinfo('Cadastro Realizado', f'Nome:{nome}\nIdade:{idade}\nE-mail:{email}')
            print(f'Nome:{nome}, Idade:{idade}, E-mail:{email}')
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
        command=jan.destroy
    ).pack(pady=5)
    
h.CTkButton(
    jan,
    text='Exibir Texto',
    command=exibir_mensagem
).pack(pady=10)

h.CTkButton(
    jan,
    text='Abrir Cadastro',
    command=abrir_cadastro
).pack(pady=10)

h.CTkButton(
    jan,
    text='Fechar',
    command=fechar
).pack(pady=10)

jan.mainloop()