import customtkinter as ctk
from time import sleep

ctk.set_appearance_mode('system')
ctk.set_default_color_theme('blue')

janela=ctk.CTk()

janela.geometry('700x500')
janela.title('SGE')
janela.resizable(False,False)

def nova_janela():
    janela2=ctk.CTkToplevel(janela, fg_color='teal')
    janela2.title('Cadastro')
    janela2.lift()
    janela2.attributes('-topmost', True)

botao=ctk.CTkButton(
        master=janela,
        text='Nova janelinha',
        width=150,
        command=nova_janela
)
botao.place(x=450,y=420)

janela.mainloop()
