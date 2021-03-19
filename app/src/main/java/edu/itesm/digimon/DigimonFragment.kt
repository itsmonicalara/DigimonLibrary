package edu.itesm.digimon

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_digimon.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [DigimonFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DigimonFragment : Fragment() {
    // TODO: Rename and change types of parameters

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_digimon, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        digi_recycler.addItemDecoration(
            DividerItemDecoration(
                digi_recycler.getContext(),
                DividerItemDecoration.VERTICAL
            )
        )
        digi_recycler.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = DigimonAdapter(createData())
        }
    }

    fun createData(): ArrayList<Digimon>{
        val list_digimon = ArrayList<Digimon>()
        list_digimon.add(Digimon(R.drawable.patamon,"Patamon", "Rookie","Patamon es un Digimon Tipo Mamifero. Su nombre viene de la palabra japonesa patapata, una onomatopeya que designa el sonido del aleteo."))
        list_digimon.add(Digimon(R.drawable.agumon,"Agumon", "Rookie","Un Digimon Reptil que ha crecido y llegó a ser capaz de caminar sobre dos patas, tiene la apariencia de un dinosaurio pequeño."))
        list_digimon.add(Digimon(R.drawable.alphamon,"Alphamon", "Mega","Alphamon es un Digimon Tipo Caballero Santo de Nivel Defintivo, cuyo nombre proviene de \"Yo soy el Alfa y el Omega \" "))
        list_digimon.add(Digimon(R.drawable.angemon,"Angemon", "Champion","Angemon es un Digimon Tipo Ángel, cuyo nombre y diseño vienen del Ángel, con la \"l\" omitida. Por ello, Angemon significaría Monstruo Ángel."))
        list_digimon.add(Digimon(R.drawable.beelzemon,"Beelzemon", "Mega","Digimon Tipo Señor Demonio cuyo nombre y diseño son sacados de Belcebú, el Príncipe de los Demonios de la mitología judeo-cristiana y de Baal Sebaoth."))
        list_digimon.add(Digimon(R.drawable.gabumon,"Gabumon", "Rookie","Gabumon es un Digimon Tipo Reptil de Nivel Infantil. Su nombre deriva de las marionetas Gabu Kashira."))
        list_digimon.add(Digimon(R.drawable.gaomon,"Gaomon", "Rookie","Gaomon es un Digimon Bestia. Se cree que es una subespecie de la especie Gazimon a la que le crecieron garras puntiagudas. Con sus movimientos agudos, se especializa en ataques \"Hit and Away\"."))
        list_digimon.add(Digimon(R.drawable.garurumon,"Garurumon", "Champion","Garurumon es un Digimon Tipo Bestia, cuyo nombre deriva de la onomatopeya del gruñido del lobo (ガルルル Garuru), mientras que su diseño deriva del lobo."))
        list_digimon.add(Digimon(R.drawable.metalgreymon,"Metalgreymon", "Ultimate","MetalGreymon es un Digimon Tipo Cyborg, cuyo nombre y diseño provienen de Metal y Greymon.uno de los Digimon de la especie ‘Grey’."))
        list_digimon.add(Digimon(R.drawable.omegamon,"Omegamon", "Mega","Digimon Tipo Caballero Santo de nivel Definitivo, cuyo nombre proviene de Omega "))
        list_digimon.add(Digimon(R.drawable.paildramon,"Paildramon", "Ultimate", "Paildramon es un Dragon Digimon. Es la forma de ADN digivolucionada de ExVeemon y Stingmon. Tiene el poder de un dragón y la defensa de un insecto."))
        list_digimon.add(Digimon(R.drawable.terriermon,"Terriermon", "Rookie","Terriermon es un animal Digimon. Es un Digimon novato extremadamente precioso que es gemelo de Lopmon."))
        list_digimon.add(Digimon(R.drawable.tsunomon,"Tsunomon", "In-Training","Tsunomon es un Digimon menor. Es un Digimon diminuto que endureció uno de los sensores en su cabeza como Punimon."))
        list_digimon.add(Digimon(R.drawable.veemon,"Veemon", "Rookie","Veemon es un Dragon Digimon. Es una nueva especie de Digimon que se descubrió recientemente."))
        list_digimon.add(Digimon(R.drawable.weregarurumon,"Weregarurumon", "Champion","WereGarurumon es un Animal Digimon. Digievolucionó de Garurumon y pudo caminar sobre dos piernas. Perdió su velocidad debido a que se volvió bípedo, pero se convirtió en un Digimon tipo Comando."))
        return list_digimon
    }



}