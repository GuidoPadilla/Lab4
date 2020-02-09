package com.example.l4


import android.app.DirectAction
import android.content.Context
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.view.*
import androidx.fragment.app.Fragment
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import androidx.annotation.IntegerRes
import androidx.core.content.ContextCompat.getSystemService
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.ui.NavigationUI
import com.example.l4.databinding.FragmentTitleBinding
import kotlinx.android.synthetic.*

/**
 * A simple [Fragment] subclass.
 */
class TitleFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding: FragmentTitleBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_title, container, false)
        binding.star.setOnClickListener{
            changeText(it, binding)
        }
        var myLocation: MyLocation
        binding.petenButton.setOnClickListener (){
            myLocation = MyLocation(name = "Peten", phrase = "Pulmon de guatemala", description ="En materia agraria, Petén tiene una historia compleja con un antecedente en 1882, cuando el presidente Justo Rufino Barrios cedió aproximadamente la mitad de este territorio a México. La extensión territorial original de Petén se redujo de 65,000 km2 (a la mitad).\n" +
                    "\n" +
                    "A finales de la colonia, el país estaba integrado por nueve provincias, una ciudad (Guatemala), y Petén como partido que formaba parte de la alcaldía mayor de Verapaz. Su territorio incluía los actuales departamentos de Alta y Baja Verapaz, parte de Izabal y todo Petén. (SEGEPLAN, 2012).\n" +
                    "\n" +
                    "Fue el departamento más grande del país, poco conocido para las autoridades del poder central. Fue gobernado por la Iglesia (principalmente la Orden de los Dominicos), no contó con el sistema de encomiendas, ni repartimientos, y tuvo poca presencia de poblados españoles.\n" +
                    "\n" +
                    "Los pueblos más importantes que se integraron al departamento fueron: Cobán, Carchá, Rabinal, Salamá, Cahabón y el Partido de Petén.\n" +
                    "\n" +
                    "En ese entonces, Petén estaba formado por nueve pueblos, con aproximadamente 2,500 personas.\n" +
                    "\n" +
                    "Por un decreto de 1825 se estableció la primera división político-administrativa oficial del país, que constaba de siete departamentos, entre ellos el de Verapaz del cual Petén formaba parte. (SEGEPLAN, 2012).\n" +
                    "Cómo llegar a la Isla de Flores en Petén")
            val action = TitleFragmentDirections.actionTitleFragmentToSecondFragment().setName(myLocation.name).setDescription(myLocation.description).setPhrase(myLocation.phrase)
            it.findNavController().navigate(action)
        }
        binding.izabalButton.setOnClickListener{
            myLocation = MyLocation(name = "Izabal", phrase = "Era buenos tiempos", description ="\n" +
                    "\n" +
                    "Por otra parte, desde el gobierno de Manuel Estrada Cabrera existían monopolios norteamericanos de empresas subsidiarias de la UFCO y que se dedicaban al transporte de carga por ferrocarril y vapores, los que salían de Puerto Barrios, Izabal, puerto controlado por la frutera.\n" +
                    "\n" +
                    "Durante su gobierno se discutió la posibilidad de ceder las minas de níquel en El Estor, Izabal a una empresa canadiense, pero la concesión no se concretó.\n" +
                    "\n" +
                    "Tras permitir que los ejecutivos de empresas mineras prácticamente reescribieran la ley de Minería de Guatemala, el gobierno otorgó una concesión por 40 años para la explotación del níquel a la empresa Explotaciones y Exploraciones Mineras de Izabal, S.\n" +
                    "\n" +
                    "Durante el gobierno de Julio César Méndez Montenegro se discutió la posibilidad de ceder las minas de níquel en Izabal, pero tan pronto como el general Carlos Arana Osorio inició su gestión el 1º de julio de 1970, reabrió el caso de EXMIBAL y empezó a trabajar para cederle la concesión.\n" +
                    "\n" +
                    "El gran Lago de Izabal está situado cerca de la costa Caribeña.\n" +
                    "\n" +
                    "De origen fluvial destacamos el lago Petén Itzá, que tiene varias islas, y en una de ellas se asienta la isla de la ciudad de Flores, y el lago de Izabal, el más grande de Guatemala, que desemboca en el golfo de Honduras a través del río Dulce.\n" +
                    "\n" +
                    "Por las condiciones para la navegación, esta vertiente contiene los principales ríos navegables, como el Sarstún, el Polochic y el del lago de Izabal, el río Dulce.\n" +
                    "\n" +
                    "En Guatemala existen grandes cantidades de níquel, cuya extracción fue otorgada en concesión a la compañía extranjera Exploraciones y Explotaciones Mineras de Izabal, S. ")
            val action = TitleFragmentDirections.actionTitleFragmentToSecondFragment().setName(myLocation.name).setDescription(myLocation.description).setPhrase(myLocation.phrase)
            it.findNavController().navigate(action)
        }
        binding.zacapaButton.setOnClickListener{
            myLocation = MyLocation(name = "Zacapa", phrase = "Tierra caliente", description ="\n" +
                    "\n" +
                    "Como efecto de la presencia de los españoles en la región oriental de Guatemala, durante los siglos XVII al XVIII, es el español el idioma general, sin embargo, existe un porcentaje de la población, especialmente el municipio de La Unión que tiene presencia del grupo maya chort’i, quienes hablan el idioma del mismo nombre.\n" +
                    "\n" +
                    "Zacapa quiere decir “sobre el río del Zacate”.  Su traducción se deriva de la voces en idioma náhuatl, “Zacatl” que significa zacate o yerba y “Apan” que se traduce a, en el río, refiriéndose indudablemente al Motagua o Rio Grande de Zacapa.\n+\n" +
                    "\n" +
                    "El Departamento de Zacapa se encuentra situado en la región Nor-Oriente de la República de Guatemala, teniendo una  configuración geográfica  bastante variada,  oscilando desde  los 130 msnm ( Gualán) hasta los 3014 msnm  (Cerro Raxón  en la cima de la Sierra de las Minas).\n" +
                    "\n" +
                    "El valle del Motagua, rodeado del inigualable bosque seco o espinoso que alberga especies exóticas como el Eloderma o “niño dormido” único en el mundo; posee frescos bosques con una amplia biodiversidad en la parte de la Sierra de Las Minas,  como el bosque nuboso donde se puede avistar el ave nacional de Guatemala: El Quetzal (Pharomachrus mocinno0 el cual es una de las más importantes  atracciónes para quienes buscan contacto con la naturaleza.\n" +
                    "\n" +
                    "El turista nacional o extranjero puede encontrar sitios maravillosos como los siguientes:\n")
            val action = TitleFragmentDirections.actionTitleFragmentToSecondFragment().setName(myLocation.name).setDescription(myLocation.description).setPhrase(myLocation.phrase)
            it.findNavController().navigate(action)

        }
        setHasOptionsMenu(true)
        return binding.root/*inflater.inflate(R.layout.fragment_title, container, false)*/
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.options_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,view!!.findNavController())
                ||super.onOptionsItemSelected(item)
    }

    private fun changeText(view: View, binding: FragmentTitleBinding){
            if (binding.hiddenText.visibility != View.VISIBLE) {
                binding.hiddenText.text = binding.nameEditText.text
                binding.nameEditText.visibility = View.GONE
                binding.nameText.visibility = View.GONE
                binding.hiddenText.visibility = View.VISIBLE
            }
            else
            {
                binding.hiddenText.text = ""
                binding.nameEditText.visibility = View.VISIBLE
                binding.nameText.visibility = View.VISIBLE
                binding.hiddenText.visibility = View.GONE
            }
    }
}
