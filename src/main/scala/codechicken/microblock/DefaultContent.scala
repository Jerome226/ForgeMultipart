package codechicken.microblock

import net.minecraft.init.Blocks._
import BlockMicroMaterial._
import MicroMaterialRegistry._

object DefaultContent 
{
    def load()
    {
        FaceMicroClass.register(0)
        HollowMicroClass.register(1)
        CornerMicroClass.register(2)
        EdgeMicroClass.register(3)
        PostMicroClass.register()
        
        createAndRegister(glass)
        createAndRegister(wool, 0 to 15)
        createAndRegister(snow)
        createAndRegister(stained_hardened_clay, 0 to 15)
        createAndRegister(hardened_clay)
        createAndRegister(stained_glass, 0 to 15)

        MicroMaterialRegistry.remapName(oldKey(grass), materialKey(grass))
        registerMaterial(new GrassMicroMaterial, materialKey(grass))
        MicroMaterialRegistry.remapName(oldKey(mycelium), materialKey(mycelium))
        registerMaterial(new TopMicroMaterial(mycelium), materialKey(mycelium))
    }
}
