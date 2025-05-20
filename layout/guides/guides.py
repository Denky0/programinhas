import customtkinter as c
janela=c.CTk()

janela.title('TAB - Working whith new TABS')
janela.geometry('700x400')
janela.resizable(False,False)

tabview=c.CTkTabview(
    janela,
    width=700,
    height=400,
    corner_radius=5,
    border_width=2,
    border_color='black',
    fg_color='white',
    segmented_button_fg_color='gray',
    segmented_button_selected_color='black',
    segmented_button_unselected_hover_color='white',
    segmented_button_unselected_color='black'
)
tabview.pack()
tabview.add('Names')
tabview.add('Ages')
tabview.add('Genres')
tabview.tab('Names').grid_columnconfigure(0, weight=1)
tabview.tab('Ages').grid_columnconfigure(0, weight=1)
tabview.tab('Genres').grid_columnconfigure(0, weight=1)

text=c.CTkLabel(tabview.tab('Names'), text='Harry Potter\nSeverus Snape\nRon Weasley\nHermione Granger')
text.pack()

idade=c.CTkLabel(tabview.tab('Ages'), text='11\n31\n11\n11')
idade.pack()
genero=c.CTkLabel(tabview.tab('Genres'), text='Male\nMale\nMale\nFemale')
genero.pack()
janela.mainloop()
