import customtkinter as s
from time import sleep

janela=s.CTk()

def fechar():
    janela.destroy()
    #janela.iconify()

janela.geometry('500x400')
janela.title('janelinha')
janela.maxsize(width=700, height=500)
janela.minsize(width=400, height=300)

button=s.CTkButton(janela, text='Aperta', width=200, command=fechar).place(x=150, y=120)

janela._set_appearance_mode('system')

janela.mainloop()

